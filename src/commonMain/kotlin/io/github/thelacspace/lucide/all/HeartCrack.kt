package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartCrack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.409f, 5.824f)
                curveToRelative(-.702f, .792f, -1.15f, 1.496f, -1.415f, 2.166f)
                lineToRelative(2.153f, 2.156f)
                arcToRelative(.5f, .5f, 0f, false, true, 0f, .707f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(.5f, .5f, 0f, false, false, 0f, .707f)
                lineTo(12f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.508f, 20.313f)
                arcToRelative(2f, 2f, 0f, false, true, -3f, .019f)
                lineTo(5f, 15f)
                curveToRelative(-1.5f, -1.5f, -3f, -3.2f, -3f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 9.591f, -3.677f)
                arcToRelative(.6f, .6f, 0f, false, false, .818f, .001f)
                arcTo(5.5f, 5.5f, 0f, false, true, 22f, 9.5f)
                curveToRelative(0f, 2.29f, -1.5f, 4f, -3f, 5.5f)
                close()
            }
}

public val LucideIcons.All.HeartCrackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartCrack: ImageVector
    @Composable get() = HeartCrackDefinition.asImageVector()
