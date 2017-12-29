package freemarker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestInclude {
	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration();
		//配置ftl的查找目录
		cfg.setDirectoryForTemplateLoading(new File("template"));
		//设置数据抓取模式
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		//构建数据
		String[] strs = new String[]{"1","2","3","4","5"}; 
		Map map = new HashMap();
		
		//实例化模板对象
		Template temp = cfg.getTemplate("testinclude.ftl");
		Writer out = new OutputStreamWriter(System.out);
		temp.process(map, out);
	}
}
