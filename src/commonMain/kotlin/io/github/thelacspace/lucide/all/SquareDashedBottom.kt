package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedBottom") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                horizontalLineToRelative(1f)
            }
}

public val LucideIcons.All.SquareDashedBottomDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedBottom: ImageVector
    @Composable get() = SquareDashedBottomDefinition.asImageVector()
