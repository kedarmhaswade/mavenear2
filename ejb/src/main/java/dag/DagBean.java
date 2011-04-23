package dag;

import javax.ejb.Stateless;

/**
 * Created by IntelliJ IDEA.
 * User: Dag
 * Date: 2011-03-10
 * Time: 20.41
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "DagEJB")
public class DagBean implements Dag {
    public DagBean() {
    }

    @Override
    public String sayHey() {
        Common common = new Common();
        return "EJB says hey. Via EJB: " + common.sayHey();
    }

}
