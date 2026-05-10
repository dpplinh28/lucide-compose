package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BotOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.67f, 8f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4.33f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 14f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 22f)
                lineTo(2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 8f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 13f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.67f, 4f)
                horizontalLineTo(12f)
                verticalLineToRelative(2.33f)
            }
}

public val LucideIcons.All.BotOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BotOff: ImageVector
    @Composable get() = BotOffDefinition.asImageVector()
