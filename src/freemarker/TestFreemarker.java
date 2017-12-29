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

public class TestFreemarker {
	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration();
		//����ftl�Ĳ���Ŀ¼
		cfg.setDirectoryForTemplateLoading(new File("template"));
		//��������ץȡģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		//��������
		Map root = new HashMap<>();
		root.put("user","sunying");
		Map latest = new HashMap();
		latest.put("url","products/greenmouse.html");
		latest.put("name","green mouse");
		root.put("latestProduct",latest);
		
		root.put("sex",1);
		
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("helloworld.ftl");
		//����HTML �����Ŀ��
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
	}
	
}
