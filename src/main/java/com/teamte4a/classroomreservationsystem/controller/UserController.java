package com.teamte4a.classroomreservationsystem.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotyspe.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.teamte4a.classroomreservationsystem.dto.UserRequest;
import com.teamte4a.classroomreservationsystem.entity.User;
import com.teamte4a.classroomreservationsystem.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping(value="/user/list")
    public String displayList(Model model) {
        List<User> userlist = UserService.searchAll();
        model.addAttribute("userlist", userlist);
        return "user/list";
    }

    //ユーザー画面表示
    @GetMapping(value = "/user/add")
    public String displayAdd(Model model) {
        model.addAttribute("userRequest", new UserRequest());
        return "user/add";
    }

    //新規登録
    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public String create(@Validated @ModelAttribute UserRequest userRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // 入力チェックエラーの場合
            List<String> errorList = new ArrayList<String>();
            for (ObjectError error : result.getAllErrors()) {
                errorList.add(error.getDefaultMessage());
            }
            model.addAttribute("validationError", errorList);
            return "user/add";
        }
        // ユーザー情報の登録
        UserService.create(userRequest);
        return "redirect:/user/list";
    }

    @GetMapping("/user/{id}")
    public String displayView(@PathVariable Long id, Model model) {
        return "user/view";
    }
}
