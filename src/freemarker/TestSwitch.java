package freemarker;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestSwitch {
	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration();
		//设置ftl文件的查找目录
		cfg.setDirectoryForTemplateLoading(new File("template"));
		//设置抓取数据的模式
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		//构建数据
		Map root = new HashMap();

		root.put("age","80");
		
		//实例化模板对象
		Template temp = cfg.getTemplate("switch.ftl");
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		
	}
	
}
