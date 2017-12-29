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

public class TestFor{
	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration();
		//����ftl�Ĳ���Ŀ¼
		cfg.setDirectoryForTemplateLoading(new File("template"));
		//��������ץȡģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		//��������
		String[] strs = new String[]{"1","2","3","4","5"}; 
		Map map = new HashMap();
		map.put("strs", strs);
		
		List list = new ArrayList<>();
		User user = new User();
		user.setId("1");
		user.setName("zs");
		list.add(user);
		
		User user2 = new User();
		user2.setId("2");
		user2.setName("ls");
		list.add(user2);
		
		map.put("userList",list);
		
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("for.ftl");
		Writer out = new OutputStreamWriter(new FileOutputStream("D:\\html\\hello.html"));
		temp.process(map, out);
	}
}
