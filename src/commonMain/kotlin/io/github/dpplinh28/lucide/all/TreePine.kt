package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreePine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 14f)
                lineToRelative(3f, 3.3f)
                arcToRelative(1f, 1f, 0f, false, true, -.7f, 1.7f)
                horizontalLineTo(4.7f)
                arcToRelative(1f, 1f, 0f, false, true, -.7f, -1.7f)
                lineTo(7f, 14f)
                horizontalLineToRelative(-.3f)
                arcToRelative(1f, 1f, 0f, false, true, -.7f, -1.7f)
                lineTo(9f, 9f)
                horizontalLineToRelative(-.2f)
                arcTo(1f, 1f, 0f, false, true, 8f, 7.3f)
                lineTo(12f, 3f)
                lineToRelative(4f, 4.3f)
                arcToRelative(1f, 1f, 0f, false, true, -.8f, 1.7f)
                horizontalLineTo(15f)
                lineToRelative(3f, 3.3f)
                arcToRelative(1f, 1f, 0f, false, true, -.7f, 1.7f)
                horizontalLineTo(17f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-3f)
            }
}

public val LucideIcons.All.TreePineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreePine: ImageVector
    @Composable get() = TreePineDefinition.asImageVector()
