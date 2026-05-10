package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Repeat1") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 2f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                verticalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 22f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.Repeat1Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Repeat1: ImageVector
    @Composable get() = Repeat1Definition.asImageVector()
