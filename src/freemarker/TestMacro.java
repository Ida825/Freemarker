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

public class TestMacro {
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
		latest.put("id_1","10");
		latest.put("id_2","5");
		latest.put("id_3","2");
		
		root.put("uselist",latest);
		
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("macro.ftl");
		//����HTML �����Ŀ��
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
	}
}
