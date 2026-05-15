package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-6.75f, 6.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.MarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mars: ImageVector
    @Composable get() = MarsDefinition.asImageVector()
