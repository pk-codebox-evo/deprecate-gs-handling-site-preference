package hello;

import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SitePreferenceController {

    @RequestMapping("/site-preference")
    public @ResponseBody String home(SitePreference sitePreference) {
        return "Hello " + sitePreference.name() + " site preference!";
    }

}
