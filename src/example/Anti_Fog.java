package example;

import arc.util.Log;
import mindustry.Vars;

public class Anti_Fog {

    public Anti_Fog(){
        // 遍历所有方块并设置 forceDark 为 false，禁用战争迷雾
        Vars.content.blocks().each(block -> block.forceDark = false);
        // 禁用规则中的战争迷雾
        Vars.state.rules.fog = false;
        //聊天栏提示
        Vars.ui.chatfrag.addMessage("已禁用战争迷雾");
        Log.info("已禁用战争迷雾");
    }

}