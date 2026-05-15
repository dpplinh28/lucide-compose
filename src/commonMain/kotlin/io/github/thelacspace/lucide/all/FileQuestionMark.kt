package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileQuestionMark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 22f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.704f, .706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.1f, 9f)
                arcToRelative(3f, 3f, 0f, false, true, 5.82f, 1f)
                curveToRelative(0f, 2f, -3f, 3f, -3f, 3f)
            }
}

public val LucideIcons.All.FileQuestionMarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileQuestionMark: ImageVector
    @Composable get() = FileQuestionMarkDefinition.asImageVector()
