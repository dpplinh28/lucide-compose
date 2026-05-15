package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudDownload") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 21f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.393f, 15.269f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.436f, 8.284f)
            }
}

public val LucideIcons.All.CloudDownloadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudDownload: ImageVector
    @Composable get() = CloudDownloadDefinition.asImageVector()
