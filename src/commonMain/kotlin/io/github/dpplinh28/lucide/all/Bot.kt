package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
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
                moveTo(15f, 13f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 13f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.BotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bot: ImageVector
    @Composable get() = BotDefinition.asImageVector()
