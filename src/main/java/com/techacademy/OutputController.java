package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OutputController {

    // 出力画面に対応するメソッド
    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val); // 入力値をモデルに追加

        // ここでpreviousパラメータの値を設定
        model.addAttribute("previousValue", val);

        return "output"; // output.htmlを表示
    }
}