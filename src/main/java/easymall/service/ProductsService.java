package easymall.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import easymall.po.Category;
import easymall.po.Products;
import easymall.pojo.MyProducts;
public interface ProductsService {
	//查找商品类别
	public List<Category> allcategorys();
	//查找商品
	public List<Products> prodlist(Map<String,Object> map);
	//根据pid查找单个商品
	public Products oneProduct(String pid);

	//根据分类查找商品
	public List<Products> proclass(Integer proclass);
	//添加商品
	public String save(MyProducts myproducts, HttpServletRequest request);

}
