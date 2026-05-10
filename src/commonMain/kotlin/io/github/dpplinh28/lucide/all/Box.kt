package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Box") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, -1f, -1.73f)
                lineToRelative(-7f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 0f)
                lineToRelative(-7f, 4f)
                arcTo(2f, 2f, 0f, false, false, 3f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 1f, 1.73f)
                lineToRelative(7f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 0f)
                lineToRelative(7f, -4f)
                arcTo(2f, 2f, 0f, false, false, 21f, 16f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(3.3f, 7f)
                lineToRelative(8.7f, 5f)
                lineToRelative(8.7f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineTo(12f)
            }
}

public val LucideIcons.All.BoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Box: ImageVector
    @Composable get() = BoxDefinition.asImageVector()
