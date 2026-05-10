package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ghost") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, 8f)
                verticalLineToRelative(12f)
                lineToRelative(3f, -3f)
                lineToRelative(2.5f, 2.5f)
                lineTo(12f, 19f)
                lineToRelative(2.5f, 2.5f)
                lineTo(17f, 19f)
                lineToRelative(3f, 3f)
                verticalLineTo(10f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                close()
            }
}

public val LucideIcons.All.GhostDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ghost: ImageVector
    @Composable get() = GhostDefinition.asImageVector()
