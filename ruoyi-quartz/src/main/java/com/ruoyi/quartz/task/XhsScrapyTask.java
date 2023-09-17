//package com.ruoyi.quartz.task;
//
//import cn.hutool.http.HttpRequest;
//import com.alibaba.fastjson2.JSON;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.microsoft.playwright.options.Cookie;
//import com.microsoft.playwright.options.LoadState;
//import com.sun.deploy.net.HttpResponse;
//import io.lettuce.core.ScriptOutputType;
//import jdk.nashorn.internal.ir.debug.JSONWriter;
//import org.springframework.stereotype.Component;
//import com.microsoft.playwright.*;
//import org.springframework.util.CollectionUtils;
////import org.openqa.selenium.Cookie;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.*;
//import java.net.HttpCookie;
//import java.util.*;
//import java.util.concurrent.TimeUnit;
//
//@Component("xhsScrapyTask")
//public class XhsScrapyTask {
//
//    public void ryNoParams() {
//
//        System.out.println("定时任务之心");
//
////        try (Playwright playwright = Playwright.create()) {
////            String webSession = "030037a233666a705be6527478224a0acf37ef";
////            String a1 = "18a88c3c1df8trm7aa3ito7f084sy9vm8593xftlv50000453089";
////            String stealthJsPath = "stealth.min.js";
////            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(Boolean.TRUE));
////            BrowserContext browserContext = browser.newContext();
////            browserContext.addInitScript(stealthJsPath);
////            Page contextPage = browserContext.newPage();
////            contextPage.navigate("https://www.xiaohongshu.com");
////            browserContext.addCookies(
////                    Arrays.asList(
////                            new Cookie("web_session", webSession).setDomain(".xiaohongshu.com").setPath("/"),
////                            new Cookie("a1", a1).setDomain(".xiaohongshu.com").setPath("/")
////                    )
////            );
////
////            Map<String, Object> jsonData = new HashMap<>();
////            jsonData.put("cursor_score", "1.6943979549770017E9");
////            jsonData.put("num", 23);
////            jsonData.put("refresh_type", 3);
////            jsonData.put("note_index", 23);
////            jsonData.put("unread_begin_note_id", "");
////            jsonData.put("unread_end_note_id", "");
////            jsonData.put("unread_note_count", 0);
////            jsonData.put("category", "homefeed_recommend");
////            jsonData.put("search_key", "");
////            jsonData.put("need_num", 8);
////            jsonData.put("image_scenes", new ArrayList<>());
////
////            String jsonStr = JSON.toJSONString(jsonData);
////            System.out.println(jsonStr);
////            Thread.sleep(2);
////
////            Map<String, Object> encryptParams = (Map<String, Object>) contextPage.evaluate("([url, data]) => window._webmsxyw(url, data)", Arrays.asList("/api/sns/web/v1/homefeed", jsonStr));
////            String xS = encryptParams.get("X-s").toString();
////            System.out.println(xS);
////
////            List<HttpCookie> httpCookies = Arrays.asList(
////                    new HttpCookie("a1", a1),
////                    new HttpCookie("web_session", webSession));
////
////            HttpRequest request = HttpRequest.post("https://edith.xiaohongshu.com/api/sns/web/v1/homefeed")
////                    .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")
////                    .header("X-S", xS)
////                    .cookie(httpCookies)
////                    .form(jsonData); // 表单内容
////
////            String response = request.execute().body();
////            System.out.println(response);
////
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//
//
////        try {
////            Process proc = Runtime.getRuntime().exec("python D:\\spider_web\\spider-web\\ruoyi-quartz\\src\\main\\resources\\test.py");
////            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
////            String line;
////            while ((line = in.readLine()) != null) {
////                System.out.println(line);
////            }
////            in.close();
////            proc.waitFor();
////        } catch (Exception e){
////            System.out.println(e);
////        }
//
//    }
//}
//
