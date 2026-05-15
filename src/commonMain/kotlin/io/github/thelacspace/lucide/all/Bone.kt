package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 10f)
                curveToRelative(.7f, -.7f, 1.69f, 0f, 2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(.5f, .5f, 0f, false, true, -.5f, -.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
                curveToRelative(0f, .81f, .7f, 1.8f, 0f, 2.5f)
                lineToRelative(-7f, 7f)
                curveToRelative(-.7f, .7f, -1.69f, 0f, -2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                curveToRelative(.28f, 0f, .5f, .22f, .5f, .5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                curveToRelative(0f, -.81f, -.7f, -1.8f, 0f, -2.5f)
                close()
            }
}

public val LucideIcons.All.BoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bone: ImageVector
    @Composable get() = BoneDefinition.asImageVector()
