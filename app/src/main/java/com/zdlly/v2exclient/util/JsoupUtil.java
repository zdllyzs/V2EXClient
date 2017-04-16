package com.zdlly.v2exclient.util;

import com.zdlly.v2exclient.model.LoginFormModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by zdlly on 2017/4/16.
 */

public class JsoupUtil {
    public static LoginFormModel parseLoginFormInfo(String response){
        LoginFormModel formInfo = new LoginFormModel();
        Element body = Jsoup.parse(response).body();
        Element once = body.select("input[name=once]").first();
        formInfo.setOnce(once.attr("value"));

        Element form = body.select("form[method=post]").first();
        Elements inputs = form.getElementsByTag("input");
        formInfo.setNameKey(inputs.get(0).attr("name"));
        formInfo.setPswKey(inputs.get(1).attr("name"));
        return formInfo;
    }
}
