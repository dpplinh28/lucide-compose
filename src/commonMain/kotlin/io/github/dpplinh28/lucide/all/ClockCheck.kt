package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(4f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                arcToRelative(10f, 10f, 0f, true, false, -11f, 9.95f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 16f)
                lineToRelative(-5.5f, 5.5f)
                lineTo(14f, 19f)
            }
}

public val LucideIcons.All.ClockCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockCheck: ImageVector
    @Composable get() = ClockCheckDefinition.asImageVector()
