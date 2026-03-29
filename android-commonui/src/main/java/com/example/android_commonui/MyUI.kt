package com.example.android_commonui


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @Author: wangxinyu
 * @Date: 2026/3/27
 * @Description:
 */
@Composable
fun MyText(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            modifier = modifier,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

/**
 * 胶囊型按钮
 * @param text 按钮文字
 * @param onClick 点击事件
 * @param modifier 修饰符
 * @param backgroundColor 背景颜色，默认蓝色
 * @param textColor 文字颜色，默认白色
 * @param enabled 是否启用，默认true
 */
@Composable
fun CapsuleButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF007AFF),
    textColor: Color = Color.White,
    enabled: Boolean = true
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(if (enabled) backgroundColor else backgroundColor.copy(alpha = 0.5f))
            .clickable(enabled = enabled, onClick = onClick)
            .padding(horizontal = 24.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = if (enabled) textColor else textColor.copy(alpha = 0.5f),
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        )
    }
}