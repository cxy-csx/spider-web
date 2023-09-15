import json
import requests
from time import sleep
from playwright.sync_api import sync_playwright

with sync_playwright() as playwright:
    stealth_js_path = "stealth.min.js"
    chromium = playwright.chromium
    browser = chromium.launch(headless=True)
    browser_context = browser.new_context()
    browser_context.add_init_script(path=stealth_js_path)
    context_page = browser_context.new_page()
    context_page.goto("https://www.xiaohongshu.com")
    browser_context.add_cookies([
        {'name': 'web_session', 'value': "030037a233666a705be6527478224a0acf37ef", 'domain': ".xiaohongshu.com",
         'path': "/"},
        {'name': 'a1', 'value': "18a88c3c1df8trm7aa3ito7f084sy9vm8593xftlv50000453089", 'domain': ".xiaohongshu.com",
         'path': "/"}]
    )
    sleep(2)
    json_data = {
        'cursor_score': '1.6943979549770017E9',
        'num': 23,
        'refresh_type': 3,
        'note_index': 23,
        'unread_begin_note_id': '',
        'unread_end_note_id': '',
        'unread_note_count': 0,
        'category': 'homefeed_recommend',
        'search_key': '',
        'need_num': 8,
        'image_scenes': [],
    }
    json_str = json.dumps(json_data, separators=(",", ":"), ensure_ascii=False)
    encrypt_params = context_page.evaluate("([url, data]) => window._webmsxyw(url, data)",
                                           ["/api/sns/web/v1/homefeed", json_data])
    x_s = dict(encrypt_params)['X-s']

    cookies = {
        'a1': '18a88c3c1df8trm7aa3ito7f084sy9vm8593xftlv50000453089',
        'web_session': '030037a233666a705be6527478224a0acf37ef'
    }

    headers = {
        'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36',
        'x-s': x_s
    }

    response = requests.post('https://edith.xiaohongshu.com/api/sns/web/v1/homefeed', cookies=cookies, headers=headers,
                             data=json_str)
    print(response.text)
