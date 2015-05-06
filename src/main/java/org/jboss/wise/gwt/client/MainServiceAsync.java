package org.jboss.wise.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import java.util.ArrayList;
import java.util.List;
import org.jboss.wise.gwt.shared.Service;
import org.jboss.wise.gwt.shared.tree.element.RequestResponse;
import org.jboss.wise.gwt.shared.tree.element.TreeElement;
import org.jboss.wise.gwt.shared.WsdlAddress;
import org.jboss.wise.gwt.shared.WsdlInfo;

/**
 * User: rsearls
 * Date: 3/8/15
 */
public interface MainServiceAsync {
   public void getAddressDetails(AsyncCallback<ArrayList<WsdlAddress>> callback);
   public void getAddress(String id, AsyncCallback<WsdlAddress> callback);
   public void getEndpoints(WsdlInfo wsdlInfo, AsyncCallback<List<Service>> callback);
   public void getEndpointReflection(String id, AsyncCallback<RequestResponse> callback);
   public void getRequestPreview(TreeElement rootTreeElement, AsyncCallback<String> callback);
   public void getPerformInvocationOutputTree(TreeElement rootTreeElement, WsdlInfo wsdlInfo, AsyncCallback<RequestResponse> callback);
}
