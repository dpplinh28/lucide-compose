package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.659f, 22f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(9.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.378f, 12.622f)
                arcToRelative(1f, 1f, 0f, false, true, 3f, 3.003f)
                lineTo(8.36f, 20.637f)
                arcToRelative(2f, 2f, 0f, false, true, -.854f, .506f)
                lineToRelative(-2.867f, .837f)
                arcToRelative(.5f, .5f, 0f, false, true, -.62f, -.62f)
                lineToRelative(.836f, -2.869f)
                arcToRelative(2f, 2f, 0f, false, true, .506f, -.853f)
                close()
            }
}

public val LucideIcons.All.FilePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePen: ImageVector
    @Composable get() = FilePenDefinition.asImageVector()
