package easymall.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import easymall.service.ProductsService;
import easymall.po.Category;
import easymall.pojo.MyProducts;

@Controller("productsControllerAdmin")
@RequestMapping("/admin")
public class ProductsControllerAdmin {
	@Autowired
	private ProductsService productsService;
	@RequestMapping("/addprod")
	public String addprod(Model model) {
		// 查找商品表中所有的商品类别
		List<Category> categorys = productsService.allcategorys();
		model.addAttribute("categorys", categorys);
		model.addAttribute("myproducts", new MyProducts());
		return "admin/add_prod";
	}
	@RequestMapping("/save")
	public String save(@Valid @ModelAttribute MyProducts myproducts, 
			HttpServletRequest request, Model model)
			throws Exception {
		String msg=productsService.save(myproducts,request);
		model.addAttribute("msg",msg);
		return "redirect:/admin/addprod";
	}
}
