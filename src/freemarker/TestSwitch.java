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
		//����ftl�ļ��Ĳ���Ŀ¼
		cfg.setDirectoryForTemplateLoading(new File("template"));
		//����ץȡ���ݵ�ģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		//��������
		Map root = new HashMap();

		root.put("age","80");
		
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("switch.ftl");
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		
	}
	
}
