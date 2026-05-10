package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(3.644f, 1.822f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.92f, 13.267f)
                arcToRelative(10f, 10f, 0f, true, false, -8.653f, 8.653f)
            }
}

public val LucideIcons.All.ClockPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockPlus: ImageVector
    @Composable get() = ClockPlusDefinition.asImageVector()
