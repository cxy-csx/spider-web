package com.ruoyi.quartz.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.options.Cookie;
import com.microsoft.playwright.options.LoadState;
import org.springframework.stereotype.Component;
import com.microsoft.playwright.*;
import org.springframework.util.CollectionUtils;
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component("xhsScrapyTask")
public class XhsScrapyTask {

    public void ryNoParams() {

        System.out.println("无参方法执行....");

        try (Playwright playwright = Playwright.create()) {
//            System.out.println();
            System.out.println(123);
//            String stealthJsPath = "stealth.min.js";
//            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(Boolean.TRUE));
//            BrowserContext browserContext = browser.newContext();
//            browserContext.addInitScript(stealthJsPath);
//            Page contextPage = browserContext.newPage();
//            contextPage.navigate("https://www.xiaohongshu.com").waitForLoadState(LoadState.LOAD);
//
//            // 添加 Cookie
//            contextPage.evaluate("document.cookie = 'web_session=030037a233666a705be6527478224a0acf37ef'");
//            contextPage.evaluate("document.cookie = 'a1=1888f578fdbj9agla4nstg5deepyty1rukr2fljaz50000388892'");
//
//            // 构建请求数据
//            String json_data = "{"
//                    + "\"cursor_score\":\"1.6943979549770017E9\","
//                    + "\"num\":23,"
//                    + "\"refresh_type\":3,"
//                    + "\"note_index\":23,"
//                    + "\"unread_begin_note_id\":\"\","
//                    + "\"unread_end_note_id\":\"\","
//                    + "\"unread_note_count\":0,"
//                    + "\"category\":\"homefeed_recommend\","
//                    + "\"search_key\":\"\","
//                    + "\"need_num\":8,"
//                    + "\"image_scenes\":[]"
//                    + "}";
//
////            OkHttpClient httpClient = new OkHttpClient.Builder()
////                    .connectTimeout(10, TimeUnit.SECONDS)
////                    .writeTimeout(10, TimeUnit.SECONDS)
////                    .readTimeout(30, TimeUnit.SECONDS)
////                    .build();
//
//            // 构建请求头
//            String x_s = contextPage.evaluate("([url, data]) => window._webmsxyw(url, data)",
//                    new Object[]{"/api/sns/web/v1/homefeed", json_data});
//
//
//            System.out.println(x_s);
//
//            // 设置 Cookie
//            String cookies = "a1=1888f578fdbj9agla4nstg5deepyty1rukr2fljaz50000388892; web_session=030037a233666a705be6527478224a0acf37ef";

//            Headers headers = new Headers.Builder()
//                    .add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")
//                    .add("x-s", x_s)
//                    .add("Cookie", cookies)
//                    .build();
//
//            // 创建 HTTP 请求体
//            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), json_data);
//
//            // 构建 HTTP 请求
//            Request request = new Request.Builder()
//                    .url("https://edith.xiaohongshu.com/api/sns/web/v1/homefeed")
//                    .headers(headers)
//                    .post(requestBody)
//                    .build();
//
//            // 发送 HTTP POST 请求
//            Response response = httpClient.newCall(request).execute();
//
//            if (response.isSuccessful()) {
//                String responseBody = response.body().string();
//                System.out.println(responseBody);
//            } else {
//                System.err.println("HTTP 请求失败，状态码：" + response.code());
//            }

            // 关闭浏览器和 Playwright
//            browser.close();
        }catch (Exception e){
            System.out.print(e);
        }

    }
}
