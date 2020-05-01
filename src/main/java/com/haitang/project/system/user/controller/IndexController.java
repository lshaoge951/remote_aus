package com.haitang.project.system.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.haitang.framework.config.HaiTangConfig;
import com.haitang.framework.web.controller.BaseController;
import com.haitang.project.system.menu.domain.Menu;
import com.haitang.project.system.menu.service.IMenuService;
import com.haitang.project.system.user.domain.User;

/**
 * 首页 业务处理
 * 
 * @author haitang
 */
@Controller
public class IndexController extends BaseController
{
    @Autowired
    private IMenuService menuService;

    @Autowired
    private HaiTangConfig ruoYiConfig;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        User user = getSysUser();
        // 根据用户id取出菜单
        List<Menu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", ruoYiConfig.getCopyrightYear());
        mmap.put("demoEnabled", ruoYiConfig.isDemoEnabled());
        return "index";
    }

    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin(ModelMap mmap)
    {
        return "skin";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        mmap.put("version", ruoYiConfig.getVersion());
        return "main";
    }
}
