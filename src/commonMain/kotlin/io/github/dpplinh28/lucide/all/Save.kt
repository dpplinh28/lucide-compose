package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Save") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.2f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.4f, .6f)
                lineToRelative(3.8f, 3.8f)
                arcToRelative(2f, 2f, 0f, false, true, .6f, 1.4f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 21f)
                verticalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.SaveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Save: ImageVector
    @Composable get() = SaveDefinition.asImageVector()
