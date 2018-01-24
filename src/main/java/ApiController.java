@RestController
@RequestMapping( value = "/api" )
public class ApiController {
 
    @RequestMapping( value = "/", method = RequestMethod.GET )
    public List<String> index() {
        List<String> s = new ArrayList<>();
        s.add("Docker + AWS CodePipline Tutorial");
        s.add("Learn more at: https://github.com/sixthpoint/Docker-AWS-CodePipeline");
        return s;
    }
}
