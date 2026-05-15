package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TowelRack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 7f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f, 3f)
                horizontalLineToRelative(11f)
                arcTo(2.5f, 2.5f, 0f, false, true, 20f, 5.5f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(5.5f)
                arcToRelative(1f, 1f, 0f, false, false, -5f, 0f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 7f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.TowelRackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TowelRack: ImageVector
    @Composable get() = TowelRackDefinition.asImageVector()
