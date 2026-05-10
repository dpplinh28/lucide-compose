package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                curveToRelative(-3f, 0f, -5f, -2f, -8f, -2f)
                arcToRelative(6f, 6f, 0f, false, false, -4f, 1.528f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 22f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.656f, 2f)
                horizontalLineTo(8f)
                curveToRelative(3f, 0f, 5f, 2f, 7.333f, 2f)
                quadToRelative(2f, 0f, 3.067f, -.8f)
                arcTo(1f, 1f, 0f, false, true, 20f, 4f)
                verticalLineToRelative(10.347f)
            }
}

public val LucideIcons.All.FlagOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagOff: ImageVector
    @Composable get() = FlagOffDefinition.asImageVector()
