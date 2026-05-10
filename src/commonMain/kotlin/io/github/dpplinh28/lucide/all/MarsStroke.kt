package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MarsStroke") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 6f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-7.75f, 7.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.MarsStrokeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MarsStroke: ImageVector
    @Composable get() = MarsStrokeDefinition.asImageVector()
