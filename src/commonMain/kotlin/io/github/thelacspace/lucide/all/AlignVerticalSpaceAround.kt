package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalSpaceAround") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 20f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 4f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.AlignVerticalSpaceAroundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalSpaceAround: ImageVector
    @Composable get() = AlignVerticalSpaceAroundDefinition.asImageVector()
