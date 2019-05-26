package controllers.customer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import dao.NoticeDao;
import vo.Notice;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	private NoticeDao noticedao;
	@Autowired
	public void setNoticedao(NoticeDao noticedao) {
		this.noticedao = noticedao;
	}
	
	@RequestMapping("notice.htm")
	public String notices(String pg , String f , String q , Model model) {
		
		int page=1;
		String field="TITLE";
		String query="%%";
				
		//조건 조합
		if(pg != null && !pg.equals("")) {
			page = Integer.parseInt(pg);
		}
				
		if(f != null && !f.equals("")) {
			field = f;
		}
				
		if(q != null && !q.equals("")) {
			query = q;
		}

		//System.out.println(page + field + query);
		//DAO 객체 생성 ... 함수 호출
		List<Notice> list=null;
		try {
			list = noticedao.getNotices(page, field, query);
		}catch (Exception e) {
			e.printStackTrace();
		} 
		
		//ModelAndView 객체 사용가능
		//return new ModelAndView
		
		//Model : 데이터 담기
		//return :view 주소 
		model.addAttribute("list", list); //View 단 페이지에 자동 forward (list 이름으로)
		
		return "notice.jsp";
	}
	
	@RequestMapping("noticeDetail.htm")
	public String noticeDetail(String seq , Model model) {
		
		Notice notice=null;
		try {
			notice = noticedao.getNotice(seq);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		model.addAttribute("notice", notice);
		
		return "noticeDetail.jsp";
	}
	
	//월요일 수업..
	//글쓰기화면 GET
	//@RequestMapping(value="noticeReg.htm",method=RequestMethod.GET)
	//글쓰기 처리 POST (파일업로드)
	//@RequestMapping(value="noticeReg.htm",method=RequestMethod.POST)
	//글삭제하기
	//hint)location.href
	//return "redirect:notice.htm"
	@RequestMapping(value="noticeReg.htm",method=RequestMethod.GET)
	public String noticeWrite() {
		
		return "noticeReg.jsp";
	}
	
	@RequestMapping(value="noticeReg.htm",method=RequestMethod.POST)
	public String noticeWriteOk(Notice notice,HttpServletRequest request) throws IOException, ClassNotFoundException, SQLException {
		
		CommonsMultipartFile imagefile = notice.getFile();
		
		notice.setFileSrc(imagefile.getOriginalFilename());
		
		String filename = imagefile.getOriginalFilename();
		String path = request.getServletContext().getRealPath("/upload");
		
		String fpath = path+"/"+filename;
		
		FileOutputStream fs = new FileOutputStream(fpath);
		fs.write(imagefile.getBytes());
		fs.close();
		
		noticedao.insert(notice);
		
		return "redirect:notice.htm";
			
	}
	
	@RequestMapping("noticeDel.htm")
	public String noticeDel(String seq) throws ClassNotFoundException, SQLException {
		noticedao.delete(seq);
		
		return "redirect:notice.htm";
	}
}
