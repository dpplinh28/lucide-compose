package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeyRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.586f, 17.414f)
                arcTo(2f, 2f, 0f, false, false, 2f, 18.828f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(.172f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -.586f)
                lineToRelative(.814f, -.814f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, -4f, -4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
}

public val LucideIcons.All.KeyRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeyRound: ImageVector
    @Composable get() = KeyRoundDefinition.asImageVector()
