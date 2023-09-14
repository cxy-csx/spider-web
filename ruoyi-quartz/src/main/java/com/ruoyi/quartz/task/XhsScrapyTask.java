package com.ruoyi.quartz.task;

import cn.hutool.core.map.MapUtil;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.options.Cookie;
import com.microsoft.playwright.options.LoadState;
import com.sun.deploy.net.HttpResponse;
import io.lettuce.core.ScriptOutputType;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.stereotype.Component;
import com.microsoft.playwright.*;
import org.springframework.util.CollectionUtils;
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component("xhsScrapyTask")
public class XhsScrapyTask {

    public void ryNoParams() {

        try (Playwright playwright = Playwright.create()) {
            String webSession = "030037a233666a705be6527478224a0acf37ef";
            String a1 = "18a88c3c1df8trm7aa3ito7f084sy9vm8593xftlv50000453089";
            String stealthJsPath = "stealth.min.js";
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(Boolean.TRUE));
            BrowserContext browserContext = browser.newContext();
            browserContext.addInitScript(stealthJsPath);
            Page contextPage = browserContext.newPage();
            contextPage.navigate("https://www.xiaohongshu.com");
            browserContext.addCookies(
                    Arrays.asList(
                            new Cookie("web_session", webSession).setDomain(".xiaohongshu.com").setPath("/"),
                            new Cookie("a1", a1).setDomain(".xiaohongshu.com").setPath("/")
                    )
            );

            Map<String, Object> jsonData = new HashMap<>();
            jsonData.put("cursor_score", "1.6943979549770017E9");
            jsonData.put("num", 23);
            jsonData.put("refresh_type", 3);
            jsonData.put("note_index", 23);
            jsonData.put("unread_begin_note_id", "");
            jsonData.put("unread_end_note_id", "");
            jsonData.put("unread_note_count", 0);
            jsonData.put("category", "homefeed_recommend");
            jsonData.put("search_key", "");
            jsonData.put("need_num", 8);
            jsonData.put("image_scenes", new ArrayList<>());

            String jsonStr = JSON.toJSONString(jsonData);
            System.out.println(jsonStr);
            Thread.sleep(5);

            Map<String, Object> encryptParams = (Map<String, Object>) contextPage.evaluate("([url, data]) => window._webmsxyw(url, data)", Arrays.asList("/api/sns/web/v1/homefeed", jsonStr));
            String xS = encryptParams.get("X-s").toString();
            System.out.println(xS);


            String url = "https://edith.xiaohongshu.com/api/sns/web/v1/homefeed";



            HttpRequest request = HttpRequest.post(url)
                    .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")
                    .header("x-s", xS)
                    .cookie("a1="+a1)
                    .cookie("webSession="+webSession)
                    .body(jsonStr);

            String response = request.execute().body();
            System.out.println(response);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

