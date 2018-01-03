package com.ben.quiz.controller.admin.teacher;

import com.ben.quiz.controller.base.BaseControllerWeb;
import com.ben.quiz.domain.common.constant.QuizTrasitionConst;
import com.ben.quiz.domain.common.exception.QuizException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping(QuizTrasitionConst.ADMIN.PAGE_TEACHER_LIST)
public class Teacher_list extends BaseControllerWeb {

    @Override
    @RequestMapping
    public String init(Map<String, Object> inModel) throws QuizException {
        if(Objects.equals( getUser().getStrTopMenu(), "ADM") || Objects.equals( getUser().getStrTopMenu(), "")){
            inModel.put("screenCode",  getUser().getStrTopMenu());
            return getDefaultPageMap(inModel, "A107");
        }else
           return redirect(QuizTrasitionConst.ERROR);
    }
}