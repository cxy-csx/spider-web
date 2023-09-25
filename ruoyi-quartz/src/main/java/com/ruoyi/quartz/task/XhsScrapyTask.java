package com.ruoyi.quartz.task;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.options.Cookie;
import com.microsoft.playwright.options.LoadState;
import io.lettuce.core.ScriptOutputType;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.stereotype.Component;
import com.microsoft.playwright.*;
import org.springframework.util.CollectionUtils;
import sun.net.www.http.HttpClient;
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.net.HttpCookie;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component("xhsScrapyTask")
public class XhsScrapyTask {

    public void ryNoParams() {

        System.out.println("定时任务之心");

        try (Playwright playwright = Playwright.create()) {
            String webSession = "030037a23e147b3fe402430675224a107016ef";
            String a1 = "18abbc23178rpgsxhpxnmn1gbw5twxhnavkskfcs250000539163";
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

            contextPage.reload();

            Map<String, Object> jsonData = new HashMap<>();
            jsonData.put("cursor_score", "");
            jsonData.put("num", 20);
            jsonData.put("refresh_type", 1);
            jsonData.put("note_index", 0);
            jsonData.put("unread_begin_note_id", "");
            jsonData.put("unread_end_note_id", "");
            jsonData.put("unread_note_count", 0);
            jsonData.put("category", "homefeed_recommend");
            jsonData.put("search_key", "");
            jsonData.put("need_num", 10);
            jsonData.put("image_scenes", Arrays.asList("\"FD_PRV_WEBP\", \"FD_WM_WEBP\""));

            String jsonStr = JSON.toJSONString(jsonData);

            Map<String, Object> encryptParams = (Map<String, Object>) contextPage.evaluate("([url, data]) => window._webmsxyw(url, data)", Arrays.asList("/api/sns/web/v1/homefeed", jsonData));
            String xS = encryptParams.get("X-s").toString();
            System.out.println(xS);


            // Define the URL
            String url = "https://edith.xiaohongshu.com/api/sns/web/v1/homefeed";

            // Create an HTTP POST request using Hutool
            HttpResponse response = HttpRequest.post(url)
                    .header(Header.USER_AGENT, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")
                    .header("x-s", xS)
                    .cookie(new HttpCookie("a1", a1))
                    .cookie(new HttpCookie("web_session", webSession))
                    .body(jsonStr)
                    .execute();

            // Check if the request was successful
            if (response.isOk()) {
                // Get the response body as a string
//                String responseBody = response.body();
//                System.out.println(response.);
                // Print the response
//                System.out.println(responseBody);
            } else {
                System.err.println("Request failed with status code: " + response.getStatus());
            }

//            List<HttpCookie> httpCookies = Arrays.asList(
//                    new HttpCookie("a1", a1),
//                    new HttpCookie("web_session", webSession));
//
//            HttpRequest request = HttpRequest.post("https://edith.xiaohongshu.com/api/sns/web/v1/homefeed")
//                    .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")
//                    .header("X-S", "XYW_eyJzaWduU3ZuIjoiNTEiLCJzaWduVHlwZSI6IngxIiwiYXBwSWQiOiJ4aHMtcGMtd2ViIiwic2lnblZlcnNpb24iOiIxIiwicGF5bG9hZCI6Ijg0Mzc0OWMzMzIzZDQ0YWE3ZjlmMDRiZmYyYmNmOTUwNzAyMzM2YjVmNDA1NjJkNjk2Nzk0OGY3ODgxOGQxNWRlMmRjYzgwMTBiNDdkZTBjMGVhOThjYzMxMjk1NjBjY2M5ZTNiZmRhMWZhYTFlYjkwZDc0YWEzMWI1NGM3MmNkMGQ3NGFhMzFiNTRjNzJjZGFjNDg5YjlkYThjZTVlNDhmNGFmYjlhY2ZjM2VhMjZmZTBiMjY2YTZiNGNjM2NiNTE0ZGRlNmM0NWM2NjQxMmE2NTNjZWNjN2QwMWE5OWQ1OTQyMTllMGRmYWFlMDdmMzJhMzYyYzE2YWU4ZWVlZTI0OTBhODRiMWM4ZWQxMDRjNTk5YjM2Yjc4MDc0MjM5MTdhZTg1NDY3ZDBlNDZhOWFiNzgzNmEwZjM1NDg0NzgwMmFiMGU1ZGNhMDVhY2JiYmNmNjg5N2Y4MWRhMTdiNDEzZWZhNTg3YWYyOWNkNmE0MDNiNWU1MDhkNTk4YjM1NiJ9")
//                    .cookie(httpCookies)
//                    .form("{\"cursor_score\":\"\",\"num\":20,\"refresh_type\":1,\"note_index\":0,\"unread_begin_note_id\":\"\",\"unread_end_note_id\":\"\",\"unread_note_count\":0,\"category\":\"homefeed_recommend\",\"search_key\":\"\",\"need_num\":10,\"image_scenes\":[\"FD_PRV_WEBP\",\"FD_WM_WEBP\"]}"); // 表单内容
//
//            String response = request.execute().body();
//            System.out.println(response);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

