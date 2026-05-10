package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(1.56f, .78f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.227f, 21.925f)
                arcToRelative(10f, 10f, 0f, true, true, 8.767f, -9.588f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 18f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                verticalLineToRelative(-8f)
            }
}

public val LucideIcons.All.ClockArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowUp: ImageVector
    @Composable get() = ClockArrowUpDefinition.asImageVector()
