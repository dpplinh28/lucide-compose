package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 9.003f)
                arcToRelative(1f, 1f, 0f, false, true, 1.517f, -.859f)
                lineToRelative(4.997f, 2.997f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.718f)
                lineToRelative(-4.997f, 2.997f)
                arcTo(1f, 1f, 0f, false, true, 9f, 14.996f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.CirclePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePlay: ImageVector
    @Composable get() = CirclePlayDefinition.asImageVector()
