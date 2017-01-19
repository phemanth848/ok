package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Student;

public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("resources/Bean.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("student");  
    student.displayInfo();  
}  
}  