/// A Bean information class.
package sunw.demo.Box;
import java.beans.*;
public class BoxBeanInfo extends SimpleBeanInfo {
public PropertyDescriptor[] getPropertyDescriptors() {
try {
PropertyDescriptor width = new PropertyDescriptor("width",BoxBeanInfo.class);
PropertyDescriptor height = new PropertyDescriptor("height",BoxBeanInfo.class);
PropertyDescriptor depth = new PropertyDescriptor("depth",BoxBeanInfo.class);
PropertyDescriptor pd[] = {height,width,depth};
return pd;
}
catch(Exception e) {
}
return null;
}
}