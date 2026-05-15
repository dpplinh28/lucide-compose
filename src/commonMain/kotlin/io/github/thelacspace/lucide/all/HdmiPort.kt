package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HdmiPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(12f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 12f)
                horizontalLineToRelative(9f)
            }
}

public val LucideIcons.All.HdmiPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HdmiPort: ImageVector
    @Composable get() = HdmiPortDefinition.asImageVector()
