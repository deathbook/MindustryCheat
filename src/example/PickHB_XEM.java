package example;

import arc.Events;
import arc.util.Log;
import mindustry.Vars;
import mindustry.gen.Call;
import mindustry.game.EventType.*;
import mindustry.mod.Mod;

public class PickHB_XEM {

    public PickHB_XEM() {
        // 监听玩家聊天事件
        Events.on(PlayerChatEvent.class, event -> {
            String message = event.message.toLowerCase(); // 转为小写，方便检测
            Log.info("玩家发送的消息: " + message);

            // 检测是否包含 "/pickhb"
            if (message.contains("/pickhb")) {
                // 提取 /pickHB 后的随机字符串
                String[] parts = message.split("\\s+"); // 按空格分割消息
                for (String part : parts) {
                    if (part.startsWith("/pickhb")) {
                        // 发送抢红包命令
                        Vars.ui.chatfrag.addMessage("[green]自动抢红包中...");
                        Log.info("自动发送命令: " + part);
                        Call.sendChatMessage(part); // 自动发送抢红包命令
                    }
                }
            }
        });
    }
}
