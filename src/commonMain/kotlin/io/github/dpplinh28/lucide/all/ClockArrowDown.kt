package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(2f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.337f, 21.994f)
                arcToRelative(10f, 10f, 0f, true, true, 9.588f, -8.767f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 18f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 14f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.ClockArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowDown: ImageVector
    @Composable get() = ClockArrowDownDefinition.asImageVector()
